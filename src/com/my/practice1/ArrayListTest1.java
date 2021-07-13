package com.my.practice1;

public class ArrayListTest1 {

  static final int MAX_LENGTH = 100;
  //객체 주소를 저장하고 꺼내는 용도
  //배열의 최대 크기를 지정하는 변수는 모든 인스턴스가 같다.
  //따라서 각 인스턴스 마다 이 변수를 가질 필요는 없다.

  //각 인스턴스 마다 개별적으로 관리해야 하는 변수는 인스턴스 변수로 선언한다
  //static 제외

  Object[] list = new Object[MAX_LENGTH];//bOARD 담을 레퍼런스 100개 만들기
  int size = 0;
  //클래스명 Board를 Object로 변경하면 다른 클래스에서도 사용 가능
  //BoardHandler가 하던 데이터를 넣고 빼던 작업을 arrayList로 넘김


  void append(Object obj) {
    this.list[this.size++] = obj;
  }


  Object[] toArray() {//현재 저장된 값을 배열로 만들어 주는 메쏘드
    Object[] arr = new Object[this.size];
    for (int i = 0; i < this.size; i++) {
      arr[i] = this.list[i];
    }
    return arr;
  }

  Object retrieve(int index) {
    return this.list[index];
  }


  void remove(int index) {
    for (int i = index; i < this.size-1; i++) {
      this.list[i] = this.list[i+1];
    }
    this.size --;
  }






}
