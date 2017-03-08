package com.general.dao.entity;

/**
 * Created by joanna on 1/5/17.
 */
public class MailFileEntity {
    private Integer file;
    private Integer mail;
    private FileEntity fileByFile;
    private MailEntity mailByMail;

    public Integer getFile() {
        return file;
    }

    public void setFile(Integer file) {
        this.file = file;
    }

    public Integer getMail() {
        return mail;
    }

    public void setMail(Integer mail) {
        this.mail = mail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MailFileEntity that = (MailFileEntity) o;

        if (file != null ? !file.equals(that.file) : that.file != null) return false;
        if (mail != null ? !mail.equals(that.mail) : that.mail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = file != null ? file.hashCode() : 0;
        result = 31 * result + (mail != null ? mail.hashCode() : 0);
        return result;
    }

    public FileEntity getFileByFile() {
        return fileByFile;
    }

    public void setFileByFile(FileEntity fileByFile) {
        this.fileByFile = fileByFile;
    }

    public MailEntity getMailByMail() {
        return mailByMail;
    }

    public void setMailByMail(MailEntity mailByMail) {
        this.mailByMail = mailByMail;
    }
}
