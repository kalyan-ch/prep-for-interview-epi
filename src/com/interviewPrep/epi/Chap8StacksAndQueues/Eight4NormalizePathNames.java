package com.interviewPrep.epi.Chap8StacksAndQueues;

import java.util.ArrayDeque;
import java.util.Deque;

public class Eight4NormalizePathNames {
    public static void main(String[] args) {
        String[] paths = {"/usr/lib/../bin/", "sc/././lib/bin"};
        for (String s: paths) {
            System.out.println(normalizePath(s));
        }
    }

    public static String normalizePath(String path){
        Deque<String> paths = new ArrayDeque<>();
        if(path.startsWith("/"))
            paths.push("/");

        String[] folderNames = path.split("/");

        for (String folder: folderNames) {
            if(!"".equals(folder) && !".".equals(folder)){
                if("..".equals(folder))
                    paths.pop();
                else
                    paths.push(folder);
            }
        }

        StringBuilder finalPath = new StringBuilder();

        while(!paths.isEmpty()){
            String s = paths.removeLast();
            finalPath.append(s);
            if(!"/".equals(s))
                finalPath.append("/");
        }
        return finalPath.toString();
    }
}
