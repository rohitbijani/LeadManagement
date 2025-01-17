package com.jio.leadmanagement.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class InterestAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInterestAllPropertiesEquals(Interest expected, Interest actual) {
        assertInterestAutoGeneratedPropertiesEquals(expected, actual);
        assertInterestAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInterestAllUpdatablePropertiesEquals(Interest expected, Interest actual) {
        assertInterestUpdatableFieldsEquals(expected, actual);
        assertInterestUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInterestAutoGeneratedPropertiesEquals(Interest expected, Interest actual) {
        assertThat(expected)
            .as("Verify Interest auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInterestUpdatableFieldsEquals(Interest expected, Interest actual) {
        assertThat(expected)
            .as("Verify Interest relevant properties")
            .satisfies(e -> assertThat(e.getCategory()).as("check category").isEqualTo(actual.getCategory()))
            .satisfies(e -> assertThat(e.getBrand()).as("check brand").isEqualTo(actual.getBrand()))
            .satisfies(e -> assertThat(e.getArticleId()).as("check articleId").isEqualTo(actual.getArticleId()))
            .satisfies(e -> assertThat(e.getOrderId()).as("check orderId").isEqualTo(actual.getOrderId()))
            .satisfies(e -> assertThat(e.getIsPurchased()).as("check isPurchased").isEqualTo(actual.getIsPurchased()))
            .satisfies(e -> assertThat(e.getCreatedAt()).as("check createdAt").isEqualTo(actual.getCreatedAt()))
            .satisfies(e -> assertThat(e.getCreatedBy()).as("check createdBy").isEqualTo(actual.getCreatedBy()))
            .satisfies(e -> assertThat(e.getUpdatedAt()).as("check updatedAt").isEqualTo(actual.getUpdatedAt()))
            .satisfies(e -> assertThat(e.getUpdatedBy()).as("check updatedBy").isEqualTo(actual.getUpdatedBy()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInterestUpdatableRelationshipsEquals(Interest expected, Interest actual) {
        assertThat(expected)
            .as("Verify Interest relationships")
            .satisfies(e -> assertThat(e.getLead()).as("check lead").isEqualTo(actual.getLead()));
    }
}
