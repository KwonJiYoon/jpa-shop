package jpabook.jpashop.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    // 관계형 DB를 객체에 맞춘,,
    @Column(name = "MEMBER_ID")
    private Long memberId;

    private Member member;
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    public Long getId() {
        return id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public Member getMember() {
        return member;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
