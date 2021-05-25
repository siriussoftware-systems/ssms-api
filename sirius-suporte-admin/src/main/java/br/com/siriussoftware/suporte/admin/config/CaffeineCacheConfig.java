package br.com.siriussoftware.suporte.admin.config;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.CacheManager;
import org.springframework.cache.caffeine.CaffeineCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

@Configuration
@SuppressWarnings("rawtypes")
public class CaffeineCacheConfig {

	@Bean
	public Caffeine caffeineConfig() {
		return 
			Caffeine.newBuilder()
				.initialCapacity(100)
				.maximumSize(500)
				.expireAfterAccess(10, TimeUnit.MINUTES)
				.weakKeys()
				.recordStats();
	}

	@SuppressWarnings("unchecked")
	@Bean
	public CacheManager cacheManager(Caffeine caffeine) {
		CaffeineCacheManager caffeineCacheManager = new CaffeineCacheManager();
		caffeineCacheManager.setCaffeine(caffeine);
		return caffeineCacheManager;
	}
}
