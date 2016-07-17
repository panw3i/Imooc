package com.example.ygd.greendao;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import com.example.ygd.greendao.VedioDownload;
import com.example.ygd.greendao.Vedio;
import com.example.ygd.greendao.ClassProj;
import com.example.ygd.greendao.Blog;

import com.example.ygd.greendao.VedioDownloadDao;
import com.example.ygd.greendao.VedioDao;
import com.example.ygd.greendao.ClassProjDao;
import com.example.ygd.greendao.BlogDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig vedioDownloadDaoConfig;
    private final DaoConfig vedioDaoConfig;
    private final DaoConfig classProjDaoConfig;
    private final DaoConfig blogDaoConfig;

    private final VedioDownloadDao vedioDownloadDao;
    private final VedioDao vedioDao;
    private final ClassProjDao classProjDao;
    private final BlogDao blogDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        vedioDownloadDaoConfig = daoConfigMap.get(VedioDownloadDao.class).clone();
        vedioDownloadDaoConfig.initIdentityScope(type);

        vedioDaoConfig = daoConfigMap.get(VedioDao.class).clone();
        vedioDaoConfig.initIdentityScope(type);

        classProjDaoConfig = daoConfigMap.get(ClassProjDao.class).clone();
        classProjDaoConfig.initIdentityScope(type);

        blogDaoConfig = daoConfigMap.get(BlogDao.class).clone();
        blogDaoConfig.initIdentityScope(type);

        vedioDownloadDao = new VedioDownloadDao(vedioDownloadDaoConfig, this);
        vedioDao = new VedioDao(vedioDaoConfig, this);
        classProjDao = new ClassProjDao(classProjDaoConfig, this);
        blogDao = new BlogDao(blogDaoConfig, this);

        registerDao(VedioDownload.class, vedioDownloadDao);
        registerDao(Vedio.class, vedioDao);
        registerDao(ClassProj.class, classProjDao);
        registerDao(Blog.class, blogDao);
    }
    
    public void clear() {
        vedioDownloadDaoConfig.getIdentityScope().clear();
        vedioDaoConfig.getIdentityScope().clear();
        classProjDaoConfig.getIdentityScope().clear();
        blogDaoConfig.getIdentityScope().clear();
    }

    public VedioDownloadDao getVedioDownloadDao() {
        return vedioDownloadDao;
    }

    public VedioDao getVedioDao() {
        return vedioDao;
    }

    public ClassProjDao getClassProjDao() {
        return classProjDao;
    }

    public BlogDao getBlogDao() {
        return blogDao;
    }

}