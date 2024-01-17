package fc.java.course2.part3;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherExample {
    public static void main(String[] args) {
        String apiKey="YOUR_API_KEY"; // 발급받은 키정보 입력
        String city="Seoul";
        String urlString="https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";
        try {
            // URL 객체 생성
            URL url=new URL(urlString);
            // 연결 초기화
            HttpURLConnection connection= (HttpURLConnection) url.openConnection();
            // HTTP 메서드 설정
            connection.setRequestMethod("GET");
            // 요청 헤더 설정 (선택 사항)
            connection.setRequestProperty("Accept", "application/json");

            // 서버 응답 확인
            int responseCode=connection.getResponseCode(); // 200
            if(responseCode==200) {
                // 스트림(Stream = 입력,출력)의 연결
                BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content=new StringBuffer();
                while((inputLine=in.readLine())!=null) {
                    content.append(inputLine);

                }
                in.close();
                System.out.println("content = " + content.toString());
                // {     }
                // Gson 라이브러리를 사용해 온도 추출
                JsonObject weatherData=JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData=weatherData.getAsJsonObject("main");
                double temp=mainData.get("temp").getAsDouble();

                System.out.println("temp = " + temp);
                connection.disconnect();
            } else {
               // 오류  ~~~
            }



        }catch(Exception e){
            e.printStackTrace(); //에러메시지 출력
        }
    }
}
