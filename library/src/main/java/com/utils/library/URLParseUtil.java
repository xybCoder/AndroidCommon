package com.utils.library;

import java.util.HashMap;

/**
 * Url解析操作
 * Created by dell on 2016/6/18.
 */
public class URLParseUtil {


    /**
     * Url
     */
    private String mUrl;

    /**
     * 协议
     */
    private String mProtocol;

    /**
     * 主机
     */
    private String mHost;

    /**
     * 端口
     */
    private int mPort = -1;

    /**
     * 路径
     */
    private String mPath;

    /**
     * 参数
     */
    private HashMap<String, String> mParamMap;

    @Deprecated
    private URLParseUtil() {
    }

    public URLParseUtil(String url) {
        if (url == null || url.length() == 0) {
            throw new IllegalArgumentException("url is illegal!");
        }
        mUrl = url;
        startParse();
    }

    /**
     * 解析URL
     */
    private void startParse() {
        String[] parts = mUrl.split("[?]"); // 以？分成两部分
        if (parts != null && parts.length > 0) {
            String[] entity = parts[0].split("://");  // 以://区分协议和主机、路径部分
            if (entity != null && entity.length > 1) {
                mProtocol = entity[0];  // 协议
                String f = entity[1];
                if (f.contains(":")) {  // 包含端口
                    mHost = f.substring(0, f.indexOf(":"));
                    if (f.contains("/")) {  // 包含路径
                        mPort = Integer.parseInt(f.substring(f.indexOf(":") + 1, f.indexOf("/")));
                        mPath = f.substring(f.indexOf("/"));
                    } else {    // 不包含路径
                        mPort = Integer.parseInt(f.substring(f.indexOf(":") + 1));
                        mPath = "";
                    }
                } else {    // 不包含端口
                    if (f.contains("/")) {  // 包含路径
                        mHost = f.substring(0, f.indexOf("/"));
                        mPath = f.substring(f.indexOf("/"));
                    } else {    // 不包含路径
                        mHost = f;
                        mPath = "";
                    }
                }
            }
            if (parts.length > 1) { // 有参数
                String[] params = parts[1].split("[&]");    // 以&区分参数
                if (params != null && params.length > 0) {
                    mParamMap = new HashMap<String, String>(params.length);
                    for (String param : params) {   // 遍历参数对
                        if (!param.contains("=")) {
                            continue;
                        }
                        String[] s = param.split("[=]");
                        if (s != null) {
                            if (s.length == 2) {    // 取出参数键值对
                                String v = s[1];
                                if (v.contains("#")) {  // 参数值去掉#部分
                                    v = v.substring(0, v.indexOf("#"));
                                }
                                mParamMap.put(s[0], v);
                            } else {
                                if (s.length == 1) {    // 无参数值附空值
                                    mParamMap.put(s[0], null);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * 获取协议名称
     *
     * @return
     */
    public String getProtocol() {
        return mProtocol;
    }

    /**
     * 获取主机名
     *
     * @return
     */
    public String getHost() {
        return mHost;
    }

    /**
     * 获取端口号
     *
     * @return
     */
    public int getPort() {
        return mPort;
    }

    /**
     * 获取路径
     *
     * @return
     */
    public String getPath() {
        return mPath;
    }

    /**
     * 获取参数对
     *
     * @return
     */
    public HashMap<String, String> getParams() {
        return mParamMap;
    }
}
