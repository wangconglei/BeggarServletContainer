package com.ljm.server.protocol.http;

import java.io.InputStream;

/**
 * @author 李佳明 https://github.com/pkpk1234
 * @date 2018-01-2018/1/14
 */
public interface HttpRequestMessageParser {
    HttpMessage parse(InputStream inputStream);
}