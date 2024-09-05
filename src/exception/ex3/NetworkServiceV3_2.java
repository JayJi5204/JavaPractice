package exception.ex3;


public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://exception.com";

        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data);
        try {
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 코드 : " + e.getAddress() + ", 메세지 : " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 코드 : " + e.getSendData() + ", 메세지 : " + e.getMessage());
        } catch (Exception e){
            System.out.println("[알 수 없는 오류] 메세지 : "+e.getMessage());
        }
        finally {
            client.disconnect();
        }

    }
}
