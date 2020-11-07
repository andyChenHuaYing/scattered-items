package org.nanshan.metaspace;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author huaying
 * @version 0.0.1
 * @since 2020/10/30
 */
public class MetaspaceGC {

    public static void main(String[] args) {
        MetaspaceGC gc = new MetaspaceGC();

        while (true) {
            try {
                System.in.read();
                System.out.println("-----开始创建------");
                gc.newSerCfg();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void newSerCfg() {
        List<SerializeConfig> list = new ArrayList<>();
        List<String> string = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            SerializeConfig cfg = new SerializeConfig();
            list.add(cfg);
            cfg.configEnumAsJavaBean(ReachType.class);
            string.add(JSONObject.toJSONString(ReachType.AI, cfg));

        }
    }

    public enum ReachType {
        AI(1, "ai");

        private int code;
        private String mgs;

        ReachType(int code, String mgs) {
            this.code = code;
            this.mgs = mgs;
        }
    }

}
