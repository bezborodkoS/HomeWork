package com.exemple.app;

import java.io.*;
import java.util.List;

public class SerializeService {
    public void serializedObject(Object object,String nameFile){
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(nameFile))) {
            objectOutputStream.writeObject(object);
            System.out.println(object.getClass().getSimpleName()+" serialized successfully.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deserializedObject(Object o,String nameFile){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nameFile))) {
             o =  ois.readObject();
            System.out.println("Deserialized"+o.getClass().getSimpleName()+": " + o);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

//    public void deserializedObject(List<Object> o, String nameFile){
//        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(nameFile))) {
//            o = (List<Object>) objectInputStream.readObject();
//            System.out.println("Deserialized"+o.getClass().getSimpleName()+": " + o);
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
//    }
}
