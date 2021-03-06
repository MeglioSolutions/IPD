package com.megliosolutions.tagspots.Objects;

/**
 * Created by Meglio on 6/13/16.
 */
public class TagObject {

    public String tag_title;
    public String category;
    public double lat;
    public double lng;
    public String key;
    public String permission;
    public String created;

    public TagObject() {
    }

    public TagObject(String tag_title, String category, double lat, double lng, String key, String permission, String created) {
        this.tag_title = tag_title;
        this.category = category;
        this.lat = lat;
        this.lng = lng;
        this.key = key;
        this.permission = permission;
        this.created = created;
    }

    public String getCategory() {
        return category;
    }

    public String getCreated() {
        return created;
    }

    public String getTag_title() {
        return tag_title;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    public String getKey() {
        return key;
    }

    public String getPermission() {
        return permission;
    }

    public void setCreated(String created){
        this.created = created;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setTag_title(String tag_title) {
        this.tag_title = tag_title;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
