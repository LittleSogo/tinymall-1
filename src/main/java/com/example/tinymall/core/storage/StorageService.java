package com.example.tinymall.core.storage;

import com.example.tinymall.core.utils.CharUtil;
import com.example.tinymall.entity.TinymallStorage;
import com.example.tinymall.service.TinymallStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

import java.io.InputStream;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @ClassName StorageService
 * @Description
 * @Author jzf
 * @Date 2020-4-9 17:16
 */
public class StorageService {
    private String active;
    private Storage storage;
    @Autowired
    private TinymallStorageService tinymallStorageService;

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    /**
     * 存储一个文件对象
     *
     * @param inputStream   文件输入流
     * @param contentLength 文件长度
     * @param contentType   文件类型
     * @param fileName      文件索引名
     */
    public TinymallStorage store(InputStream inputStream, long contentLength, String contentType, String fileName) {
        String key = generateKey(fileName);
        storage.store(inputStream, contentLength, contentType, key);

        String url = generateUrl(key);
        TinymallStorage storageInfo = new TinymallStorage();
        storageInfo.setStorageName(fileName);
        storageInfo.setStorageSize((int) contentLength);
        storageInfo.setStorageType(contentType);
        storageInfo.setStorageKey(key);
        storageInfo.setStorageUrl(url);
        tinymallStorageService.add(storageInfo);

        return storageInfo;
    }

    private String generateKey(String originalFilename) {
        int index = originalFilename.lastIndexOf('.');
        String suffix = originalFilename.substring(index);

        String key = null;
        TinymallStorage storageInfo = null;

        do {
            key = CharUtil.getRandomString(20) + suffix;
            storageInfo = tinymallStorageService.findByKey(key);
        }
        while (storageInfo != null);

        return key;
    }

    public Stream<Path> loadAll() {
        return storage.loadAll();
    }

    public Path load(String keyName) {
        return storage.load(keyName);
    }

    public Resource loadAsResource(String keyName) {
        return storage.loadAsResource(keyName);
    }

    public void delete(String keyName) {
        storage.delete(keyName);
    }

    private String generateUrl(String keyName) {
        return storage.generateUrl(keyName);
    }
}
