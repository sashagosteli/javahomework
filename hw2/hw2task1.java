
package javahw.hw2;

import java.util.HashMap;
import java.util.Map;

public class hw2task1 {
    public static void main(String[] args) {
        // Дана строка sql-запроса "select * from students where ".
        // Сформируйте часть WHERE этого запроса,
        // используя StringBuilder. Данные для фильтрации приведены ниже
        // в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации:
        // {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

        Solution();

    }

    public static void Solution() {
        Map<String, String> params1 = new HashMap<String, String>();
        params1.put("name", "Ivanov");
        params1.put("country", "Russia");
        params1.put("city", "Moscow");
        params1.put("age", null);
        System.out.print("select * from students where ");
        System.out.println(getQuery(params1));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder s = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                s.append(pair.getKey() + " = " + pair.getValue() + " AND ");
            }
        }
        s.delete(s.toString().length() - 5, s.toString().length());
        return s.toString();
    }

}
