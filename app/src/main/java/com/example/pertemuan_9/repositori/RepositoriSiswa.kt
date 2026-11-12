package com.example.pertemuan_9.repositori

import com.example.pertemuan_9.room.Siswa
import com.example.pertemuan_9.room.SiswaDao
import kotlinx.coroutines.flow.Flow

interface RepositoriSiswa {
    fun getAllSiswaStream(): Flow<List<Siswa>>

  