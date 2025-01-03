public class Sign{
    private String message;
    private int width;
    public Sign(String m, int w){
        width = w;
        message = m;
    }
    public int numberOfLines(){
        int lines = message.length() / width + 1;
        if(message.length() % width == 0) return lines;
        return lines + 1;
    }
    
    public String getLines(){
        String s = "";
        int i = 0;
        while(i < message.length()){
            s+= message.substring(i, i + 1);
            i++;
            if(i % width == 0) s += ";";
        }
        return s;

    }
}