package com.learning.pattern.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * @author: dengxin.chen
 * @date: 2019-10-30 17:11
 * @description: 具体角色
 */
@Data
public class DeepConcretePrototype implements DeepPrototype, Serializable {
    private String name;
    private List<String> hobbies;

    @Override
    public DeepPrototype clone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            oos.close();

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            DeepPrototype object = (DeepPrototype) ois.readObject();
            bis.close();
            return object;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
