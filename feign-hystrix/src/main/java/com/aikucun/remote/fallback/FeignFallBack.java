package com.aikucun.remote.fallback;

import com.aikucun.remote.IFeignRemote;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class FeignFallBack implements FallbackFactory<IFeignRemote> {

    @Override
    public IFeignRemote create(Throwable throwable) {
        StringBuffer sb = new StringBuffer("IFeignRemote fallback ");
        sb.append("timeout");
        System.out.println(sb.toString());
        return new IFeignRemote() {

            @Override
            public String get() {
                return "timeout-error";
            }
        };
    }
}
