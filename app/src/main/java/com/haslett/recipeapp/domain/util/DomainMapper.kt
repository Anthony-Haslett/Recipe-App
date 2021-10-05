package com.haslett.recipeapp.domain.util

interface DomainMapper<T, DomainModel> {

    // Map from an entity to domain model
    fun mapToDomainModel(model: T): DomainModel

    fun mapFromDomainModel(domainModel: DomainModel): T
}