package com.codingera.Iterator;

import java.util.Iterator;

/**
 * Created by Yan on 2017/5/5.
 */
public class TestIterator {

    public static void main(String[] args){
        TvChannel tvChannel = new TvChannel();
        Iterator<String> iterator = tvChannel.iterator();

        while (iterator.hasNext()){
            System.out.println("频道:"+iterator.next());
        }
    }
}
