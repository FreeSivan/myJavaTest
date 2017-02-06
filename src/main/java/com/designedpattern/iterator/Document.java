package com.designedpattern.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by xiwen.yxw on 2017/2/6.
 */
public class Document implements Iterable<Field> {

    private final List<Field> fields = new ArrayList<Field>();

    @Override
    public Iterator<Field> iterator() {
        return fields.iterator();
    }

    public void addField(Field field) {
        fields.add(field);
    }

    public Field getField(int index) {
        return fields.get(index);
    }

    public void removeField(String filedName) {
        fields.remove(filedName);
    }

    public static void main(String[] args) {
        Document doc = new Document();
        doc.addField(new Field());
        doc.addField(new Field());
        doc.addField(new Field());
        doc.addField(new Field());
        doc.addField(new Field());
        doc.addField(new Field());
        for (Field field : doc) {
            field.output();
        }
    }
}
