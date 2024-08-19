package lang.object.tostring;

public class Zergling {
    private String zerglingName;

    private int count;

    public Zergling(String zerglingName,int count){
        this.zerglingName=zerglingName;
        this.count=count;
    }
    //Zergling은 toString()을 재정의

    @Override
    public String toString() {
        return "Zergling{" +
                "zerglingName='" + zerglingName + '\'' +
                ", count=" + count +
                '}';
    }
}
