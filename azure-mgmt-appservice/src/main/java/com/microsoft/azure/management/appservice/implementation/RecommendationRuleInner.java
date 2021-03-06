/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.implementation;

import java.util.UUID;
import com.microsoft.azure.management.appservice.NotificationLevel;
import com.microsoft.azure.management.appservice.Channels;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a recommendation rule that the recommendation engine can perform.
 */
public class RecommendationRuleInner {
    /**
     * Unique name of the rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * UI friendly name of the rule.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Localized name of the rule (Good for UI).
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Recommendation ID of an associated recommendation object tied to the
     * rule, if exists.
     * If such an object doesn't exist, it is set to null.
     */
    @JsonProperty(value = "recommendationId")
    private UUID recommendationId;

    /**
     * Localized detailed description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Name of action that is recommended by this rule in string.
     */
    @JsonProperty(value = "actionName")
    private String actionName;

    /**
     * Level of impact indicating how critical this rule is. Possible values
     * include: 'Critical', 'Warning', 'Information', 'NonUrgentSuggestion'.
     */
    @JsonProperty(value = "level")
    private NotificationLevel level;

    /**
     * List of available channels that this rule applies. Possible values
     * include: 'Notification', 'Api', 'Email', 'Webhook', 'All'.
     */
    @JsonProperty(value = "channels")
    private Channels channels;

    /**
     * An array of category tags that the rule contains.
     */
    @JsonProperty(value = "tags")
    private List<String> tags;

    /**
     * True if this is associated with a dynamically added rule.
     */
    @JsonProperty(value = "isDynamic")
    private Boolean isDynamic;

    /**
     * Extension name of the portal if exists. Applicable to dynamic rule only.
     */
    @JsonProperty(value = "extensionName")
    private String extensionName;

    /**
     * Deep link to a blade on the portal. Applicable to dynamic rule only.
     */
    @JsonProperty(value = "bladeName")
    private String bladeName;

    /**
     * Forward link to an external document associated with the rule.
     * Applicable to dynamic rule only.
     */
    @JsonProperty(value = "forwardLink")
    private String forwardLink;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the message value.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message value.
     *
     * @param message the message value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get the recommendationId value.
     *
     * @return the recommendationId value
     */
    public UUID recommendationId() {
        return this.recommendationId;
    }

    /**
     * Set the recommendationId value.
     *
     * @param recommendationId the recommendationId value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withRecommendationId(UUID recommendationId) {
        this.recommendationId = recommendationId;
        return this;
    }

    /**
     * Get the description value.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description value.
     *
     * @param description the description value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the actionName value.
     *
     * @return the actionName value
     */
    public String actionName() {
        return this.actionName;
    }

    /**
     * Set the actionName value.
     *
     * @param actionName the actionName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }

    /**
     * Get the level value.
     *
     * @return the level value
     */
    public NotificationLevel level() {
        return this.level;
    }

    /**
     * Set the level value.
     *
     * @param level the level value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withLevel(NotificationLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get the channels value.
     *
     * @return the channels value
     */
    public Channels channels() {
        return this.channels;
    }

    /**
     * Set the channels value.
     *
     * @param channels the channels value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withChannels(Channels channels) {
        this.channels = channels;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public List<String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the isDynamic value.
     *
     * @return the isDynamic value
     */
    public Boolean isDynamic() {
        return this.isDynamic;
    }

    /**
     * Set the isDynamic value.
     *
     * @param isDynamic the isDynamic value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withIsDynamic(Boolean isDynamic) {
        this.isDynamic = isDynamic;
        return this;
    }

    /**
     * Get the extensionName value.
     *
     * @return the extensionName value
     */
    public String extensionName() {
        return this.extensionName;
    }

    /**
     * Set the extensionName value.
     *
     * @param extensionName the extensionName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withExtensionName(String extensionName) {
        this.extensionName = extensionName;
        return this;
    }

    /**
     * Get the bladeName value.
     *
     * @return the bladeName value
     */
    public String bladeName() {
        return this.bladeName;
    }

    /**
     * Set the bladeName value.
     *
     * @param bladeName the bladeName value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withBladeName(String bladeName) {
        this.bladeName = bladeName;
        return this;
    }

    /**
     * Get the forwardLink value.
     *
     * @return the forwardLink value
     */
    public String forwardLink() {
        return this.forwardLink;
    }

    /**
     * Set the forwardLink value.
     *
     * @param forwardLink the forwardLink value to set
     * @return the RecommendationRuleInner object itself.
     */
    public RecommendationRuleInner withForwardLink(String forwardLink) {
        this.forwardLink = forwardLink;
        return this;
    }

}
