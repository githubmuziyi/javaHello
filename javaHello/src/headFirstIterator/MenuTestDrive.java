package headFirstIterator;

/**
 * Created by muzi on 2017/7/1.
 */
public class MenuTestDrive {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(dinerMenu, pancakeHouseMenu);
        waitress.printMenu();
    }
}
