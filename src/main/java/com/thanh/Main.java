package com.thanh;

import com.thanh.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    static List<Student> student = new ArrayList<Student>();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            student.add(new Student(i));
        }
        localVariableLambada();
        charSequenceCompare();
        characterToString();
        stringNew();
    }

    public static final void localVariableLambada() {
        //
        student.stream().map((var student1) -> {
            return student1.getId();
        });
    }

    public static final void charSequenceCompare() {
        var value = CharSequence.compare("1", "1");
        System.out.println(value);
    }

    public static final void characterToString() {
        // bằng với alt + số
        var value1 = Character.toString(77);
        System.out.println(value1);
    }

    public static final void stringNew() {
        // Lines
        var str = "thanh \n đẹp \t zai";
        // trả về 1 array strem, được phân cách từ chuỗi string ra, cắt bởi suống dòng
        Stream<String> stremString = str.lines();
        stremString.forEach(System.out::println);

        // isBlank
        // trả về true nếu là rỗng, false nếu không rỗng Thorw lỗi nếu string là null
        System.out.println(str.isBlank());

        // String repeat(int)
        // Trả về mỗi string có giá trị  là nối của chuỗi này lặp lại với số lần truyền vào
        var strRepeat = "1 2 ";
        System.out.println(strRepeat.repeat(2));
        System.out.println("================= strip ==============");

        // String strip();
        // Trả về một chuỗi có giá trị là chuỗi này, với tất cả khoảng trắng ở đầu và cuối được loại bỏ
        Character c = '\u2002';
        String s = c + "abc" + c;
        System.out.println(" check là khoảng trắng " + Character.isWhitespace(c));
        System.out.println(" check chuỗi có khoảng trắng so sánh với trim " + s.equals(s.trim()));
        System.out.println(" strip so sanh abc " + s.strip().equals("abc"));
        System.out.println(" trim so sanh abc " + s.trim().equals("abc"));

        System.out.println("================= stripLeading ==============");

        // String stripLeading();
        // Trả về một chuỗi với tất cả khoảng trắng ở đầu bị xóa
        Character cstripLeading = '\u2002';
        String sstripLeading = cstripLeading + "abc" + cstripLeading;
        System.out.println(" check là khoảng trắng " + Character.isWhitespace(cstripLeading));
        System.out.println(sstripLeading.stripLeading());

        System.out.println("================= String stripTrailing():  ==============");

        // String stripLeading();
        // Trả về một chuỗi với tất cả khoảng trắng ở cuối  bị xóa
        Character cTrailing = '\u2002';
        String sTrailing = cTrailing + "abc" + cTrailing;
        System.out.println(" check là khoảng trắng " + Character.isWhitespace(cTrailing));
        System.out.println(sTrailing.stripTrailing());
    }
}
