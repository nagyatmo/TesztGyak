package main.java.tdd.homework;

import java.util.ArrayList;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {

    }

    public static String stringOnReturn(List<String> params){
        //stringOnReturnEmptyTest()
        if(params.size()==0) {
            return "Hello, my friend";
        //
        //stringOnReturnOneParamTest
        }else if(params.size()==1){
            //stringOnReturnSingleUppercaseTest
            if(params.get(0).equals(params.get(0).toUpperCase())){
                return "HELLO, "+params.get(0).toUpperCase();
            //
            }
            return "Hello, "+params.get(0);
        //
        //stringOnReturnMultipleParamTest
        }else if(params.size()>1){
            List<String> upperCaseNamesStored = new ArrayList<>();
            String result="Hello, ";
            for(int i=0;i<params.size();i++){
                String current = params.get(i);
                //stringOnReturnCommaSplitTest
                if(current.contains(",")){
                    String[] splittedCurrent = current.split(",");
                    current=splittedCurrent[0];
                    for(int j=1;j< splittedCurrent.length;j++){
                        params.add(splittedCurrent[j].replace(" ",""));
                    }
                }
                //
                if(i<params.size()-1){
                    if(current.equals(current.toUpperCase())){
                        upperCaseNamesStored.add(current);
                    }else {
                        result += current + ", ";
                    }
                }else if(i==params.size()-1){
                    if(current.equals(current.toUpperCase())){
                        upperCaseNamesStored.add(current);
                    }else {
                        result += "and " + current + ".";
                    }
                }
            }
            //stringOnReturnMixedUppercaseTest
            if(upperCaseNamesStored.size()>0) {
                result += " AND HELLO ";
                for (int i = 0; i < upperCaseNamesStored.size(); i++) {
                    if(i<upperCaseNamesStored.size()-1){
                        result+=upperCaseNamesStored.get(i)+", ";
                    }
                    else if(i==upperCaseNamesStored.size()-1){
                        result+="AND " + upperCaseNamesStored.get(i)+"!";
                    }
                }
            }
            return result;
            //
        }
        //
        return "";
    }
}
