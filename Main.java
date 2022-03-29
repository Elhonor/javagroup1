package com.company;

import java.util.*;

class outerClass {
    int a = 5;
    class innerClass{
        public int myInnerClassMethod(){
            return a+5;
        }
    }
}
public class Main {

//    static void myMethod(){
//        System.out.println("Method iwladi");
//    }
//    static void myMethod1 (String oding, String familiyang, int yoshing){
//        System.out.println(oding + familiyang + yoshing);
//    }
//    static int myIntMethod (int x, int y){
//        return x+y;
//    }
//    static void checkAge(int yoshi){
//        if (yoshi >= 18){
//            System.out.println("Access granted");
//        }else {
//            System.out.println("Access denied");
//        }
//    }

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello world" + " and UFOs" + " 124585" + "45454");
//        System.out.println("David" + " Alberto");
//        String myString = "Alliluya";
//        System.out.println(myString);
//        int a = 10;
//        int b = 20;
//        System.out.println(Math.max(a,b));
//        int c = a + b;
//        double d = 10.4;
//        double e = 15.4;
////        System.out.println(Math.max(d,e));
//        boolean myBoolean = true;
//        int[] meningIntegerArrayim = {1000};
//        for (int i = 0; i <= 1000; i=i+2){
//            System.out.println(i);
//        }

//        String[] myStringArray = {"BMW","Audi","Mersedez-Benz","Cadillac"};
//        for (String cars : myStringArray) {
//            System.out.println(cars);
//        }
//
//       int a = 0;
//       while (a<=5){
//           System.out.println(a);
//           a++;
//       }

//        int gun = 1;
//        switch (gun){
//
//            case 1 :
//                System.out.println("Dushanba");
//                break;
//            case 2 :
//                System.out.println("Seshanba");
//                break;
//            case 3 :
//                System.out.println("Chorshanba");
//                break;
//            case 4 :
//                System.out.println("Payshanba");
//                break;
//            case 5 :
//                System.out.println("Juma");
//                break;
//            case 6 :
//                System.out.println("Shanba");
//                break;
//            case 7 :
//                System.out.println("Yakshanba");
//                break;
//
//        }
//        String[] ozbekOvqotlori = {"Polov","Kovop","Worvo"};
//        String[] EuropeOvqotlori = {"Pizza","Spaghetti","Salmon"};
////
//
//        ArrayList<String> myArrayList = new ArrayList<>(Arrays.asList());
//        myArrayList.addAll(List.of(ozbekOvqotlori));
//        myArrayList.addAll(List.of(EuropeOvqotlori));
////        System.out.println(myArrayList);
//
//        String[] cars = {"BMW","Ford"};
//        ArrayList<String> secondArrayList = new ArrayList<>(Arrays.asList());
//        secondArrayList.addAll(List.of(cars));
//        secondArrayList.addAll(myArrayList);
//        System.out.println(secondArrayList);

//        int a = 5;
//
//        if (a<10){
//            System.out.println("B dogri");
//        }else {
//            System.out.println("B nodogri");
//        }
//        myMethod();
//        myMethod1("Izzat"," Matchanov ",20);

//        System.out.println(myIntMethod(5,3));
//        checkAge(18);
//     Smartphone mySmartphone = new Smartphone();
//        System.out.println(mySmartphone.KomponiasiniOdi);
//        System.out.println(mySmartphone.cqqonYili);
//        System.out.println(mySmartphone.model);
//        System.out.println(mySmartphone.cipi);
//        System.out.println(mySmartphone.ekron);
//        System.out.println(mySmartphone.material);
//        System.out.println(mySmartphone.camerasi);
//        System.out.println(mySmartphone.setlari);
//        System.out.println(mySmartphone.botoriasiEmkosMah);
//        System.out.println(mySmartphone.zowitosi);
//        System.out.println(mySmartphone.puli$);
//        mySmartphone.oddiMethod();
//        System.out.println(mySmartphone.getBotoriasiEmkosMah());
//        mySmartphone.setBotoriasiEmkosMah(5000);
//        System.out.println(mySmartphone.getBotoriasiEmkosMah());
//          laptop hp = new laptop("Futuristic ",2021 ,"Intel i10 ","Coqqon ",1000 );
//          System.out.println(hp.companyName + hp.modelName + hp.chip + hp.price + hp.yearOfProduction + hp.screen);
//          Modifiers modifikatorlo = new Modifiers();
//       PrivateClass bolo = new PrivateClass();
//       bolo.setName("Kamron");
//       bolo.setAge(12);
//       bolo.setHeight(175);
//       bolo.setWeight(60);
//        System.out.println("Odi : " + bolo.getName());
//        System.out.println("Yoshi : " + bolo.getAge());
//        System.out.println("Boyi : " + bolo.getHeight());
//        System.out.println("Vesi : " + bolo.getWeight());
//        Mowin ferrari = new Mowin();
//        ferrari.signal();
//
//        MowinBr bugatti = new MowinBr();
//        bugatti.signal();
//
//        MowinIkki lamborghini = new MowinIkki();
//        lamborghini.signal();
//        outerClass myOuterClass = new outerClass();
//        outerClass.innerClass myInnerClass1 = myOuterClass.new innerClass();
//        System.out.println(myInnerClass1.myInnerClassMethod());
//        Explain abstactObject = new Explain();
//        abstactObject.explain();
//        abstactObject.explain1();
//        abstactObject.setName("Abstract class");
//        abstactObject.setAge(1);
//        System.out.println(abstactObject.getName() + " " + abstactObject.getAge());
//        Explain2 myInterfaceObject = new Explain2();
//        myInterfaceObject.myInterfaceMethod();
//        myInterfaceObject.secondMethod();
//        System.out.println("This is the interface and it's like abstraction");
//        LinkedList<String> bozorlq = new LinkedList<>();
//        bozorlq.add("pomidor");
//        bozorlq.add("pyoz");
//        bozorlq.add("et");
//        bozorlq.add("limon");
//        bozorlq.add("Burunc");
//        bozorlq.add("yog");
//        bozorlq.addFirst("gawr");
//        System.out.println(bozorlq);
//        bozorlq.addLast("pereprava");
//        System.out.println(bozorlq);
//        System.out.println(bozorlq.getFirst());
//        System.out.println(bozorlq.getLast());
//        bozorlq.remove("gawr");
//        System.out.println(bozorlq);
//        bozorlq.removeFirst();
//        bozorlq.removeLast();
//        System.out.println(bozorlq);
//        System.out.println(bozorlq.size());
//        Scanner scanner = new Scanner(System.in);
////
//        System.out.println("Odni grt : ");
//        String od = scanner.nextLine();
//        if (od.length() > 1){
//            System.out.println("Odinz : " + od);
//        }else {
//            System.out.println("xoto");
//        }
//        System.out.println("Yoshinni grt : ");
//        int yosh = scanner.nextInt();
//        if (yosh >= 18){
//            System.out.println("Yoshinz : " + yosh);
//        }else {
//            System.out.println("Yoshin kcci holi Gawr gormaka");
//        }


//        System.out.println("Familiani grt : ");
//        String familia = scanner.nextLine();


//        System.out.println(od + " " + familia + " " + yosh);
//       Map<String,String> map = new HashMap<>();
//       map.put("1A","Apple");
//       map.put("2A","Samsung");
//        System.out.println(map);
//        map.remove("1A");
//        System.out.println(map);
//        map.replace("2A","Samsung","DXX");
//        System.out.println(map);
//        System.out.println(map.entrySet());
////        map.clear();
//        System.out.println(map);
//        System.out.println(map.containsKey("2A"));
//        System.out.println(map.containsValue("DXX"));
//        System.out.println(map.size());
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("Mersedes-Benz");
//        System.out.println(hashSet);
//        Dog caplan = new Dog();
//        caplan.barks();
//
//        ItBolosi caplan1 = new ItBolosi();
//        caplan1.barks();

//        Encapsulation privateObj = new Encapsulation();
//        privateObj.setNameOfCEO("Tim Cook");
//        privateObj.setSalary(3000000);
//        System.out.println(privateObj.getNameOfCEO() + " " + privateObj.getSalary())

//    int a = 20;
//     if (a<=20){
//         System.out.println("B dogri");
//     }else {
//         System.out.println("B nodogri");
//     }






//     int abc = 10;
//     while (abc>5){
//         System.out.println("B while loop");
//         break;
//     }
//        int day = 1;
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//        }

//        String[] cars = {"BMW","Audi","Cadillac","Ford"};
//        String[] uzbekCars = {"Nexia 3","Cobalt","Malibu","Tohoe"};
//
//        ArrayList<String> vehicle = new ArrayList<>();
//        vehicle.addAll(List.of(cars));
//        vehicle.addAll(List.of(uzbekCars));
//        System.out.println(vehicle);
//
//        int[] intArray1 = {1,2,3};
//
//        int[] intArray2 = {4,5,6};
//
//        ArrayList<Integer> numbers = new ArrayList<>();
//        for (int i = 0; i < intArray1.length; i++) {
//            numbers.add(new Integer(intArray1[i]));
//        }
//        for (int i = 0; i < intArray2.length; i++) {
//            numbers.add(new Integer(intArray2[i]));
//        }
//        System.out.println(numbers);
//        String [] uzbekCars = {"Nexia 3", "Malibu","Tohoe","Trailblazer"};
//        String [] europeanCars = {"Audi","Mers","Rolls Royce","Cadillac"};
//        ArrayList<String> cars = new ArrayList<>();
//        cars.addAll(List.of(uzbekCars));
//        cars.addAll(List.of(europeanCars));
//        System.out.println(cars);
//        System.out.println(cars.size());
//        cars.add(0,"Tesla");
//        System.out.println(cars);
//        cars.set(0,"Mustang");
//        System.out.println(cars);
//        System.out.println(cars.get(0));
//        cars.remove(0);
//        System.out.println(cars);
//        cars.remove("Nexia 3");
//        System.out.println(cars);
//        cars.clear();
//        System.out.println(cars);

//        Java OOP
//        Random obj = new Random();
//        obj.explain();
//        obj.setName("BMW");
//        obj.setAge(2021);
//        System.out.println(obj.getName() + " " + obj.getAge());
//        Inheritence obj0 = new Inheritence();
//        obj0.myMethod();
//
//        Inheritence1 obj1 = new Inheritence1();
//        obj1.myMethod();

//        Polymorphism obj0 = new Polymorphism();
//        obj0.myMethod0();
//        obj0.myMethod1();
//        obj0.myMethod2();
//
//        Polymorhism1 obj1 = new Polymorhism1();
//        obj1.myMethod0();
//        obj1.myMethod1();
//        obj1.myMethod2();
//
//        Polymorhism2 obj2 = new Polymorhism2();
//        obj2.myMethod0();
//        obj2.myMethod1();
//        obj2.myMethod2();
//
//        Polymorhism3 obj3 = new Polymorhism3();
//        obj3.myMethod0();
//        obj3.myMethod1();
//        obj3.myMethod2();

//        MacBook obj =  new MacBook();
//        obj.compute();
//
//        Calc obj1 = new Calc();
//        obj1.compute1();
//        GetterSetter obj = new GetterSetter();
//        obj.setName("sdsd ");
//        obj.setAge(515);
//        System.out.println(obj.getName() + "\n" + obj.getAge());
//        System.out.println("Men grant uttim");

    }
}
