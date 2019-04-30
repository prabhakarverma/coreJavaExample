package testing;

import java.util.HashMap;
import java.util.Map;

public class UseMap
{
    public static void main( String[] args )
    {
        Test t1 = new Test( "asd", "prab" );
        Test t2 = new Test( "asd", "prab" );
        Test t3 = new Test( "asd", "prab" );

        Map<Test, String> map = new HashMap<>(  );

        map.put( t1, "najir" );
        map.put( t2, "najir" );
        map.put( t3, "najir" );

        System.out.println(map);
        System.out.println(map.size());

    }
}
