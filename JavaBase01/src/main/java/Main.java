public class Main {
    public static void main(String[] args) {

        CarArrayList carArrayList = new CarArrayList();

        for (int i = 0; i < 100; i++) {
            carArrayList.add(new Car("Brand" + i, i));
        }

        for (int i = 0; i <= carArrayList.size(); i++) System.out.println(carArrayList.get(i));


    }
}
