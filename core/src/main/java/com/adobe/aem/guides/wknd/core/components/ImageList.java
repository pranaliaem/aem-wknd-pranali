package com.adobe.aem.guides.wknd.core.components;

import org.apache.sling.api.resource.Resource;

import java.util.Collection;

/**
 * Represents the WKND Image List Component
 */
public interface ImageList {

    /**
     * @return a collection of objects representing the items that compose the the list.
     */
    Collection<ImageList.ListItem> getListItems();

    /**
     * @return true if this component has no list items to display.
     */
    boolean isEmpty();

    /**
     * Describes a item of the Image List.
     */
    interface ListItem {
        /**
         * This method returns a resource that is an WKND Image Component resource (rather than an image binary, such as a DAM asset).
         * This resource is intended to be rendered via the WKND Image Component's logic via a Sling include of this resource.
         *
         * @return the (Sling) resource that represents that image to display in the list.
         */
        Resource getImage();

        /**
         * @return the title of the Image List item.
         */
        String getTitle();

        /**
         * @return the url to the Page the Image List item represents.
         */
        String getURL();
    }
}
