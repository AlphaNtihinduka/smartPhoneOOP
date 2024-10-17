//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        SmartPhonePrice retailPrice1 = new SmartPhonePrice("Retail", 2000);
        SmartPhonePrice retailPrice2 = new SmartPhonePrice("Retail", 3500);

        SmartPhonePrice producterPrice1 = new SmartPhonePrice("Producer", 1500);
        SmartPhonePrice producterPrice2 = new SmartPhonePrice("Producer", 3000);

        SmartPhone iphone = new SmartPhone("Iphone", "Iphone13", 6000, producterPrice1, retailPrice1);
        SmartPhone sumsung = new SmartPhone("Sumsung", "Samsung S23", 7000, producterPrice2, retailPrice2);

        if (iphone.equals(sumsung)) {
            System.out.println(iphone.modelName + ", is equal to" + sumsung.modelName);
        } else {
            System.out.println(iphone.modelName + ", is not equal to" + sumsung.modelName);
        }

        try {
            SmartPhone newClonedSumsung = (SmartPhone) sumsung.clone();
            System.out.println("Cloned Phone: "+newClonedSumsung);

            if(sumsung.equals(newClonedSumsung)) {
                System.out.println("The Sumsung phone is equal to the cloned sumsung phone");
            } else
                System.out.println("The Sumsung phone is not equal to the cloned sumsung phone");

        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error occured");
        }
    }
}