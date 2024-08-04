package hello.proxy.app.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @RequestMapping
 * - 스프링 MVC 는 타입에 @Controller 또는 @RequestMapping annotation 이 있어야 스프링 컨트롤러로 인식한다.
 * - 그리고 스프링 컨트롤러로 인식 되어야, HTTP URL 이 매핑되고 동작한다. (@RequestMapping 은 인터페이스에 사용해도 된다)
 */
/**
 * @ResponseBody
 * - HTTP 메시지 컨버터를 사용해서 응답한다. (@ResponseBody 은 인터페이스에 사용해도 된다)
 */

@RequestMapping
@ResponseBody
public interface OrderControllerV1 {
    /**
     * - request()는 LogTrace 적용할 메서드
     * - noLog()는 단순히 LogTrace 를 적용하지 않을 메서드
     */
    @GetMapping("/v1/request")
    String request(@RequestParam("itemId") String itemId);

    @GetMapping("/v1/no-log")
    String noLog();
}
