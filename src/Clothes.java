/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-29 10:07
 */







/**  编写一个表示自动洗衣机的类Washer类，并且在他的程序入口main()方法中提供一段模拟洗衬衫操作的程序代码
 * 1：按下”开机“按钮。
 * 2：把洗衣模式设为”快洗“
 * 3：向洗衣机内放入衬衫
 * 4：按下”开始“按钮
 * 5：当洗衣结束后，取出衬衫
 * 6：按下”关机“按钮
 *
 *
 *
 *用Clothes类来表示待洗的衣服，他又名字String  类型的name   还有表示 是否干净的boolean类型的isClean属性，对着两个属性提供相应的个读取和设置属性的方法
 *
 *
 * */
public class Clothes {
      private  String name;
      private  boolean  isClean ;

    public Clothes(String name, boolean isClean) {
        this.name = name;
        this.isClean = isClean;
    }

    public Clothes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "name='" + name + '\'' +
                ", isClean=" + isClean +
                '}';
    }
}
