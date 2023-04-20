package fr.usmb.m1isc.compilation.tp;

import java_cup.runtime.Symbol;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import static fr.usmb.m1isc.compilation.tp.EnumAnalyzer.NOT;

public class Main {
    public static ArrayList<String> var = new ArrayList<>();
    public static int nb_while = 0;
    public static int nb_gt = 0;
    public static int nb_andor = 0;
    public static String file_name = "output.asm";

    public static void main(String[] args) throws Exception  {
        //creation de l'arbre
        LexicalAnalyzer yy;
        if (args.length > 0)
            yy = new LexicalAnalyzer(new FileReader(args[0])) ;
        else
            yy = new LexicalAnalyzer(new InputStreamReader(System.in)) ;
        @SuppressWarnings("deprecation")
        parser p = new parser (yy);
        Symbol s = p.parse( );
        System.out.println("Grammaire : ");
        System.out.println(s.value);

        //transcription de l'arbre en assembleur
        if(args.length == 2){
            file_name = args[1];
        }
        Tree inter = (Tree) s.value;
        FileWriter output = new FileWriter(file_name);
        output.write("DATA SEGMENT\n");
        printVar(output,inter);
        output.write("DATA ENDS\n");
        output.write("CODE SEGMENT\n");
        writeInFile(output,inter);
        output.write("CODE ENDS\n");
        output.close();
        System.out.println("Compilation terminée ! lancer le fichier :" + file_name);
    }

    //verifie si la variable existe deja
    public static boolean isInVar(String v){
        for(int i = 0 ; i < var.size() ; i++){
            if(var.get(i).equals(v)){
                return true;
            }
        }
        return false;
    }

    //affiche les variables du programme
    public static void printVar(FileWriter file, Tree tree) throws IOException {
        if(tree.fd != null){
            printVar(file,tree.fd);
        }
        if(tree.fg != null){
            printVar(file,tree.fg);
        }
        if(tree.getType() == EnumAnalyzer.VAR){
            String v = (String) tree.getValue();
            if(!isInVar(v)) {
                var.add(v);
                file.write("	"+tree.getValue() + " DD\n");
            }
        }
    }

    //transcrit l'arbre en code assembleur
    public static void writeInFile(FileWriter file, Tree tree) throws IOException {

        switch(tree.getType()){
            case VAR:
            case ENTIER:
                file.write("	mov eax,"+ tree.getValue() + "\n");
                break;
            case MOIN:
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write("	mul eax, -1\n");
                break;
            case LET:
                if(tree.fd != null){
                    writeInFile(file,tree.fd);
                }
                file.write( "	mov " + tree.fg.getValue() + ", eax\n");
                break;
            case OPERATEUR:
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write( "	push eax\n");
                if(tree.fd != null){writeInFile(file,tree.fd);}
                file.write( "	pop ebx\n");

                if(tree.getValue().equals("-")){file.write( "	sub ebx, eax\n");}
                else if(tree.getValue().equals("*")){file.write( "	mul eax, ebx\n");}
                else if(tree.getValue().equals("/")){file.write( "	div ebx, eax\n");}
                else{file.write( "	add eax, ebx\n");}
                if(tree.getValue().equals("/") || tree.getValue().equals("-")){
                    file.write( "	mov ebx, eax\n");
                }
                break;
            case MOD:
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write( "	push eax\n");
                if(tree.fd != null){writeInFile(file,tree.fd);}
                file.write( "	pop ebx\n");
                file.write( "	mov ecx,eax\n");
                file.write( "	div ecx,ebx\n");
                file.write( "	mul ecx,ebx\n");
                file.write( "	sub eax,ecx\n");
                break;
            case POINT_VIRGULE:
                if(tree.fg != null){
                    writeInFile(file,tree.fg);
                }
                if(tree.fd != null){
                    writeInFile(file,tree.fd);
                }
                break;
            case DO:
                nb_while++;
                final int nb = nb_while;
                file.write("debut_while_"+nb+":\n");
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write("	jz sortie_while_"+nb+"\n");
                if(tree.fd != null){writeInFile(file,tree.fd);}
                file.write("	jmp debut_while_"+nb+"\n");
                file.write("sortie_while_"+nb+":\n");
                break;
            case IF:
                nb_while++;
                final int nbif = nb_while;
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write("	jz debut_then_"+nbif+"\n");
                if(tree.fd != null && tree.fd.fg != null){writeInFile(file,tree.fd.fg);}
                file.write("	jmp fin_if_"+nbif+"\n");
                file.write("debut_then_"+nbif+":\n");
                if(tree.fd != null && tree.fd.fd != null){writeInFile(file,tree.fd.fd);}
                file.write("fin_if_"+nbif+":\n");
                break;
            case BOOLEAN:
                nb_gt++;
                final int nb_op = nb_gt;
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write("	push eax\n");
                if(tree.fd != null){writeInFile(file,tree.fd);}
                file.write("	pop ebx\n");
                if(tree.getValue().equals("<")){
                    file.write("	sub eax, ebx\n");
                    file.write("	jle faux_gt_"+nb_op+"\n");
                    file.write("	mov eax,1\n");
                    file.write("	jmp sortie_gt_"+nb_op+"\n");
                    file.write("faux_gt_"+nb_op+":\n");
                    file.write("	mov eax,0\n");
                    file.write("sortie_gt_"+nb_op+":\n");
                }
                if(tree.getValue().equals("<=")){
                    file.write("	sub eax, ebx\n");
                    file.write("	jl faux_gte_"+nb_op+"\n");
                    file.write("	mov eax,1\n");
                    file.write("	jmp sortie_gte_"+nb_op+"\n");
                    file.write("faux_gte_"+nb_op+":\n");
                    file.write("	mov eax,0\n");
                    file.write("sortie_gte_"+nb_op+":\n");
                }
                if(tree.getValue().equals("=")){
                    file.write("	sub ebx, eax\n");
                    file.write("	jz faux_e_"+nb_op+"\n");
                    file.write("	mov eax,0\n");
                    file.write("	jmp sortie_e_"+nb_op+"\n");
                    file.write("faux_e_"+nb_op+":\n");
                    file.write("	mov eax,1\n");
                    file.write("sortie_e_"+nb_op+":\n");
                }
                break;
            case OR:
                nb_andor++;
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write( "	jnz sortie_or_" + nb_andor +"\n");
                if(tree.fd != null){writeInFile(file,tree.fd);}
                file.write( "sortie_or_" + nb_andor +":\n");
                break;
            case AND:
                nb_andor++;
                    if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write( "	jz sortie_and_" + nb_andor +"\n");
                if(tree.fd != null){writeInFile(file,tree.fd);}
                file.write( "sortie_and_" + nb_andor +":\n");
                break;
            case NOT:
                nb_andor++;
                int nbNot = nbNot(tree);
                Tree fg = tree.fg;
                if(fg != null){
                    while(fg.fg.getType() == NOT){fg = fg.fg;} //on skip tout les not et apres on genere a l'interieur
                    writeInFile(file,fg.fg);
                }
                file.write( "	jnz faux_not_" + nb_andor +"\n");
                if(nbNot % 2 == 0 && nbNot != 0){file.write( "	mov eax, 1\n");}else{file.write( "	mov eax, 0\n");}
                file.write( "	jmp vrai_not_" + nb_andor + "\n");
                file.write( "faux_not_" + nb_andor + ":\n");
                if(nbNot % 2 == 0 && nbNot != 0){file.write( "	mov eax, 0\n");}else{file.write( "	mov eax, 1\n");}
                file.write( "vrai_not_" + nb_andor + ":\n");
                break;
            case INPUT:
                file.write("	in eax\n");
                break;
            case OUTPUT:
                if(tree.fg != null){writeInFile(file,tree.fg);}
                file.write("	out eax\n");
                break;
        }
    }

    //renvoie le nombre de not a la suite
    public static int nbNot(Tree t){
        int res = 0;
        while(t.fg.getType() == NOT){
            t = t.fg;
            res++;
        }
        return res;
    }
}