package string;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//http://elementsofprogramminginterviews.com/solutions/java/ValidIPAddress.java
public class ComputeValidIPAddress {


    public int validateIPAddress(String ip) {
       List<String> parts = Stream.of(ip.split("\\."))
         .filter(s->s.length()>0&&!s.startsWith("0"))
        .filter(s->Integer.valueOf(s)<=255&&Integer.valueOf(s)>=0)
        .collect(Collectors.toList());

return parts.size();

    }
}
