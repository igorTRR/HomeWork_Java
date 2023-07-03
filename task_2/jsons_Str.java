package task_2;

//    Дана json строка (можно сохранить в файл и читать из файла)

// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]

// Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида: 
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:

// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


 public class jsons_Str {
    private static final String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +            
    "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +            
    "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";    
    private static final String El1 = "Студент ";    
    private static final String El2 = " получил ";    
    private static final String El3 = " по предмету ";    
    public static void main(String[] args) {        
        StringBuilder sb = new StringBuilder();        
        String newjson = json.replaceAll("\\{", "").replaceAll("\\}", "").replaceAll("\"", "").replace('[', ' ').replace(']', ' ');        
        //System.out.println(newjson);        
        String[] parts = newjson.split(",");        
        for (String part : parts){            
            String[] params = part.split(":");            
            if("фамилия".equals(params[0].trim())) 
            {                
                sb = new StringBuilder(El1).append(params[1]);            
            }            else if("оценка".equals(params[0].trim())) sb.append(El2).append(params[1]);            
            else if("предмет".equals(params[0].trim())) {                
                sb.append(El3).append(params[1]);                
                System.out.println(sb);          
            }  
              } 
             
}
}


