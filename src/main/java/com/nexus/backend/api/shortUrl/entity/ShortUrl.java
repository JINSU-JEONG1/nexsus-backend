package com.nexus.backend.api.shortUrl.entity;

import com.nexus.backend.common.BaseEntity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * shortUrl 엔티티
 */
@Entity 
@Table(name = "SHORT_URL")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ShortUrl extends BaseEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ORIGIN_URL", nullable = false, unique = true, length = 2000)
    private String originUrl;

    @Column(name = "SHORT_URL", unique = true, nullable = false, length = 20)
    private String shortUrl;

    @Builder
    public ShortUrl(String originUrl) {
        this.originUrl = originUrl;
    }

    public void updateShortKey(String shortUrl) {
        this.shortUrl = shortUrl; 
    }



}
