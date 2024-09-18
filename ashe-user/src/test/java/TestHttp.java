import cn.hutool.crypto.digest.DigestUtil;
import cn.hutool.crypto.digest.MD5;
import cn.hutool.http.HttpResponse;
import cn.hutool.http.HttpUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * TestHttp
 *
 * @author cc
 * @since 2024/8/20 10:35
 */
public class TestHttp {
    public static void main(String[] args) {
        String url = "http://mydex.56print.com/api/Service/QueryProduct";
        String tokenId = "428";
        String accessToken = "EVl7mBU2bL0lscPrtWhM1X6Hw5wAdiUT";
        String timestamp = String.valueOf(System.currentTimeMillis()/1000);

        String encode = DigestUtil.md5Hex(DigestUtil.md5Hex(accessToken) + timestamp);
        String sign= encode.toUpperCase();

        Map<String, String> header = new HashMap<>();
        header.put("DADAN-TokenID", tokenId);
        header.put("DADAN-AccessToken", accessToken);
        header.put("DADAN-Timestamp", timestamp);
        header.put("DADAN-Sign", sign);
        System.out.println("url:" + url);
        System.out.println("sign:" + sign);
        System.out.println("timestamp:" + timestamp);
        try (HttpResponse response = HttpUtil.createGet(url).headerMap(header, true).execute()) {
            String body = response.body();
            System.out.println("响应结果:" + body);
        } catch (Exception e) {
            System.out.println("响应异常:" + e.getMessage());
        }

        System.out.println('A' - 'a'); // standardized.address.notfound
    }
}
