package com.nexus.backend.api.shortUrl.repository;

import com.nexus.backend.api.shortUrl.entity.ShortUrl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// JpaRepository<[엔티티 이름], [엔티티 PK 타입]>
public interface ShortUrlRepository extends JpaRepository<ShortUrl, Long> {

    Optional<ShortUrl> findByShortUrl(String shortUrl);

    Optional<ShortUrl> findByOriginUrl(String originUrl);
}
