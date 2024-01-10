package fc.java.model2;

import java.util.Arrays;

public class BookArray {
    private final int DEFAULT_CAPICITY=5; // 배열의 초기용량(크기), 수정불가(final)=>상수
    private Book[] elements;
    private int size=0; // 저장된 원소의 개수
    // 생성동작
    public BookArray() {
        elements=new Book[DEFAULT_CAPICITY]; // 5개크기배열
    }
    // 저장하는 동작
    public void add(Book element) {
        if(size==elements.length){
            // 크기를 2배로 늘리는 작업
            ensureCapacity();
        }
        elements[size++]=element;
    }
    // 얻는동작
    public Book get(int index) { // -1, 5~
        if (index<0 || index>=size){
            throw new IndexOutOfBoundsException("index의 범위(0~4)가 초과됨"); // JVM이 예외처리
        }
        return elements[index];
    }
    // 원소의 개수를 넘겨주는 동작
    public int size() {
        return size;
    }

    private void ensureCapacity() {
        int newCapacity=elements.length*2;
        elements=Arrays.copyOf(elements, newCapacity);
    }

}
