
package javasort;
//import java.lang.Comparable;
public class Dados implements Comparable<Dados>{
   private String name;
   private int num;
   private String type;
   private String img;

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getType() {
        return type;
    }

    public String getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setImg(String img) {
        this.img = img;
    }

   
    @Override    
    public int compareTo(Dados outroDado){
      return this.getName().
              compareTo(outroDado.getName());
    }
    
}
