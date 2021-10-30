import java.util.*;

class Main {
  static void printList(LinkedList<String> I){
    Iterator<String> it = I.iterator();
    while(it.hasNext()){
      String e = it.next();
      String separator;
      if(it.hasNext()) separator = "->";
      else separator = "\n";
      System.out.print(e + separator);
    }
  }



  public static void main(String[] args) {
    LinkedList<String> myList = new LinkedList<>();
    myList.add("트랜스포머");
    myList.add("스타워즈");
    myList.add("매트릭스");
    myList.add(0, "터미네이터");
    myList.add(2, "아바타");

    Collections.sort(myList);
    printList(myList);

    Collections.reverse(myList);
    printList(myList);

    int index = Collections.binarySearch(myList, "아바타") + 1;
    System.out.println("아바타는" + index + "번 째 요소입니다.");


  }
}
