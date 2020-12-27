
package br.sca.util;

public class ExcecaoSCA extends Exception{
    private String msg;

    
    public ExcecaoSCA (String msg){
        this.setMsg(msg);
    }
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
