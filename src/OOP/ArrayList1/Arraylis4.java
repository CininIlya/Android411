package OOP.ArrayList1;




public class ArrayList {
    public static <Arraylist> void main(String[] args) {

        Arraylist<String> arraylist = new Arraylist<>();
        arraylist.add("Валерий");
        arraylist.add("Ирина");
        arraylist.add("Игорь");
        System.out.println(arraylist);

        Arraylist<String> arraylist2 = new Arraylist<>(20);
        arraylist2.add("Валерий");
        arraylist2.add("Ирина");
        System.out.println(arraylist2);

        List<String> arrayList3 = new ArrayList<>();// Интерфейс
        arraylist3.add("Валерий");
        arraylist3.add("Ирина");
        System.out.println(arraylist3);

        Arraylist<String> arraylist4 = new Arraylist<>(arraylist);
        System.out.println(arraylist4);
        arraylist4.add("Владимир");
        System.out.println(arraylist4);
        System.out.println(arraylist);

        Arraylist arraylist5 = new Arraylist();
        arraylist5.add("Валерий");
        arraylist5.add(7);
        arraylist5.add(true);
        System.out.println(arraylist5);
        arraylist5.set(1, false);

        System.out.println(arraylist5);

        Arraylist<String arraylist6 = new Arraylist<>();
        arraylist6.add("!!!");
        arraylist6.add("???");
        arraylist6.addAll(1,arraylist);
        System.out.println(arraylist6);
//        arraylist6.removeAll(arraylist);
//        System.out.println(arraylist6);
//      arraylist6.retainAll(arraylist);
//        System.out.println(arraylist6);

List <String > myList = arrayList6.subList(0,3);
        System.out.println(myList);
        myList.add("Борис");
        System.out.println(myList);
        System.out.println(arraylist6);


//        String [] array = arraylist6.toArray(new String[0]);
//        for (String s: array){
//            System.out.print(s + " ");
//        }
//
//        System.out.println("\n" + array.length);

        Collections.sort(arrayList6);
        System.out.println(arraylist6);

//        Collections.shuffle(arrayList6);
//        System.out.println(arraylist6); перемешивание

        Collections.reverse(arrayList6);// разворот списка
        System.out.println(arraylist6);

        Collections.swap(arrayList6,0,2);// замена на определеные с 0 индекса на 2 индекс меняем местами
        System.out.println(arraylist6);


        // ИТЕРАТОР переборшик

        Iterator <String> iterator = arrayList6.iterator();
        while (iterator.hasNext())// метод возвращает булево значение если следующии эл существует
//        System.out.println(iterator.next());// вызывает каждый след элемент
            iterator.next();
            iterator.remove();// удаление след. элемента
    }

}


