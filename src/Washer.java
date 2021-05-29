import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSOutput;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-29 10:07
 */
public class Washer {

        public  static final String OFF_STATUS = "关机状态";
        public  static final String ON_STATUS = "开机状态";
        public  static final String WASHING_STATUS = "正在洗衣状态";
        public  static final String SUSPEND_STATUS = "关机状态";
        public  static final String FINISHED_STATUS = "关机状态";


        // 表示 洗衣模式   1：标准   2：快洗   3：慢洗
    private int mode = 1;
    //  表示水位， 1：低水位  2： 中水位  3： 高水位
    private int waterLevel = 1;
    //  表示 洗衣机的状态   初始值为关机
    private String status = OFF_STATUS;
    // 表示洗衣机内的衣服
    private Clothes clothes;
    // 设置洗衣机状态


    public Washer(int mode, int waterLevel, String status, Clothes clothes) {
        this.mode = mode;
        this.waterLevel = waterLevel;
        this.status = status;
        this.clothes = clothes;
    }

    public Washer(int mode) {
        this.mode = mode;
    }

    public Washer(String status) {
        this.status = status;
    }

    public Washer(Clothes clothes) {
        this.clothes = clothes;
    }

    public Washer() {

    }

    public static String getOffStatus() {
        return OFF_STATUS;
    }

    public static String getOnStatus() {
        return ON_STATUS;
    }

    public static String getWashingStatus() {
        return WASHING_STATUS;
    }

    public static String getSuspendStatus() {
        return SUSPEND_STATUS;
    }

    public static String getFinishedStatus() {
        return FINISHED_STATUS;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        if(status.equals(ON_STATUS) || status.equals(SUSPEND_STATUS)) {
            this.mode = mode;
        }
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public void setWaterLevel(int waterLevel) {
        if(status.equals(ON_STATUS) || status.equals(SUSPEND_STATUS)) {
            this.waterLevel = waterLevel;
        }
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        System.out.println("进入"+status);
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void on(){
        setStatus(ON_STATUS);
    }

    public void off(){
        setStatus(OFF_STATUS);
    }

    public void putClothes(Clothes clothes){
        System.out.println("向洗衣机放入"+clothes);
        this.clothes = clothes;
    }
    public void takeOutClothes(){
        System.out.println("向洗衣机取出"+clothes);
        this.clothes = clothes;

    }

    public void start() {
        if (status.equals(ON_STATUS) || status.equals(SUSPEND_STATUS)) {
            setStatus(WASHING_STATUS);
            System.out.println("洗衣机卖力地洗" + clothes + "..");
            setStatus(FINISHED_STATUS);
            clothes.setClean(true);

        }
    }
        public void suspend(){
            if(status.equals(WASHING_STATUS)) {
                setStatus(SUSPEND_STATUS);
            }

        }

    public static void main(String[] args) {
        Washer washer = new Washer();
        washer.on();
        washer.setMode(2);
        Clothes clothes = new Clothes("衬衫",false);
        washer.putClothes(clothes);
        washer.start();
        washer.takeOutClothes();
        washer.off();
        System.out.println(clothes.getName()+"是否洗干净"+clothes.isClean());
    }


    }



