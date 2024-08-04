package hello.proxy.app.v1;

/**
 * v1 - 인터페이스와 구현 클래스 - 스프링 빈으로 수동 등록
 */
public interface OrderRepositoryV1 {
    void save(String itemId);
}
