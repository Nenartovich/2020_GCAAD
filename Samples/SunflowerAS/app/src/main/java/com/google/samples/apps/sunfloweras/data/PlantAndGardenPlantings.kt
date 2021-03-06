/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.sunfloweras.data

import androidx.room.Embedded
import androidx.room.Relation

/**
 * This class captures the relationship between a [Plant] and a user's [GardenPlanting], which is
 * used by Room to fetch the related entities.
 * Этот класс фиксирует связь между [растением] и [посадкой сада] пользователя, которая
 * используется комнатой для извлечения связанных сущностей.
 * Имеет свою ViewModel
 */
data class PlantAndGardenPlantings(
    @Embedded  // Определяет класс, экземпляры которого хранятся как неотъемлемая часть исходного объекта
    val plant: Plant,

    // **********************  что-то сложное изучать *************************
    @Relation(parentColumn = "id", entityColumn = "plant_id")
    val gardenPlantings: List<GardenPlanting> = emptyList()
)
