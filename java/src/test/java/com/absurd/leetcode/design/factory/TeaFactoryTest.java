package com.absurd.leetcode.design.factory;

import com.absurd.leetcode.design.factory.abstractf.TeaFactoryImpl;
import com.absurd.leetcode.design.factory.method.GreenTeaFactory;
import com.absurd.leetcode.design.factory.method.RedTeaFactory;
import com.absurd.leetcode.design.factory.simple.TeaFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author absurd
 * @version TeaFactoryTest.java, v 0.1 2023年10月07日 16:22 absurd
 */
public class TeaFactoryTest {
    @Test
    public void create_simple(){
        Tea tea = TeaFactory.createTea(TeaCategoryEnum.GREEN);
        Assert.assertTrue(tea instanceof GreenTea);
        Tea tea2 = TeaFactory.createTea(TeaCategoryEnum.RED);
        Assert.assertTrue(tea2 instanceof RedTea);
    }

    @Test
    public void create_method(){
        com.absurd.leetcode.design.factory.method.TeaFactory redTeaFactory = new RedTeaFactory();
        Tea tea = redTeaFactory.createTea();
        Assert.assertTrue(tea instanceof RedTea);

        com.absurd.leetcode.design.factory.method.TeaFactory greenTeaFactory = new GreenTeaFactory();
        Tea tea2 = greenTeaFactory.createTea();
        Assert.assertTrue(tea2 instanceof GreenTea);
    }

    @Test
    public void create_abstractf(){
        com.absurd.leetcode.design.factory.abstractf.TeaFactory teaFactory = new TeaFactoryImpl();
        Tea tea =teaFactory.createRedTea();
        Assert.assertTrue(tea instanceof RedTea);

        Tea tea2 = teaFactory.createGreenTea();
        Assert.assertTrue(tea2 instanceof GreenTea);
    }


}