import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public static void main(String[] args) {
        /*Circle circle = new Circle(3.75);

        System.out.println("circle.radius= " + circle.getRadius());

        System.out.println("circle.area= " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);

        System.out.println("cylinder.radius= " + cylinder.getRadius());

        System.out.println("cylinder.height= " + cylinder.getHeight());

        System.out.println("cylinder.area= " + cylinder.getArea());

        System.out.println("cylinder.volume= " + cylinder.getVolume());*/

        System.out.println("---------------------------------------------------------");

        /*Rectangle rectangle = new Rectangle(5, 10);

        System.out.println("rectangle.width= " + rectangle.getWidth());

        System.out.println("rectangle.length= " + rectangle.getLength());

        System.out.println("rectangle.area= " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5,10,5);

        System.out.println("cuboid.width= " + cuboid.getWidth());

        System.out.println("cuboid.length= " + cuboid.getLength());

        System.out.println("cuboid.area= " + cuboid.getArea());

        System.out.println("cuboid.height= " + cuboid.getHeight());

        System.out.println("cuboid.volume= " + cuboid.getVolume());
*/
        System.out.println("---------------------------------------------------------");
        HRManager hr = new HRManager(13,"Ali",30000,
                new JuniorDeveloper[5],new MidDeveloper[3],new SeniorDeveloper[6]);
        JuniorDeveloper jun = new JuniorDeveloper(12,"Mehmet" , 50000);
        JuniorDeveloper jun1 = new JuniorDeveloper(13,"Ahmet" , 50000);
        JuniorDeveloper jun2 = new JuniorDeveloper(14,"Nuri" , 50000);
        JuniorDeveloper jun3 = new JuniorDeveloper(15,"Semih" , 50000);
        hr.work(20000);
        hr.addEmployee(0,jun);
        hr.addEmployee(1,jun1);
        hr.addEmployee(2,jun2);
        hr.addEmployee(3,jun3);
        System.out.println(hr.toString());
    }
}