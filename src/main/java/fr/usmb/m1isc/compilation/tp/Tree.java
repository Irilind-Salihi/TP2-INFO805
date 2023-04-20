package fr.usmb.m1isc.compilation.tp;

public class Tree {

    private EnumAnalyzer type;
    private Object value;
    public Tree fg,fd;

    public Tree(EnumAnalyzer type, Object value) {
        this.type = type;
        this.value = value;
        this.fg = null;
        this.fd = null;
    }

    public Tree(EnumAnalyzer type, Object value, Tree fg, Tree fd) {
        this.type = type;
        this.value = value;
        this.fg = fg;
        this.fd = fd;
    }

    public String toString(){
        String res = value.toString() + " ";
        if(fg != null){ res += fg.toString();}
        if(fd != null){ res += fd.toString();}
        if(fg != null || fd != null){
            res = "( " + res + ") ";
        }
        return res;
    }

    public EnumAnalyzer getType() {
        return type;
    }

    public void setType(EnumAnalyzer type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Tree getFg() {
        return fg;
    }

    public void setFg(Tree fg) {
        this.fg = fg;
    }

    public Tree getFd() {
        return fd;
    }

    public void setFd(Tree fd) {
        this.fd = fd;
    }

    public String gencode(){
        if(type == EnumAnalyzer.ENTIER){return value+"";}
        if(type == EnumAnalyzer.VAR){return value+"";}
        return value+"";
    }
}