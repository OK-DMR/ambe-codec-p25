cmake_minimum_required(VERSION 3.4.1)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -O0 -frtti")

add_executable( ambe main.cpp )

add_library( core-lib IMPORTED SHARED )
set_target_properties( core-lib PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/liblib-core.so )
target_link_libraries( ambe core-lib )

add_library( c++-shared IMPORTED SHARED )
set_target_properties( c++-shared PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libc++_shared.so )
target_link_libraries( ambe c++-shared )

add_library( libauthlib IMPORTED SHARED )
set_target_properties( libauthlib PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libauthlib.so )
target_link_libraries( ambe libauthlib )

add_library( libcrypto_solib IMPORTED SHARED )
set_target_properties( libcrypto_solib PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libcrypto_solib.so )
target_link_libraries( ambe libcrypto_solib )

add_library( libdliotp IMPORTED SHARED )
set_target_properties( libdliotp PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libdliotp.so )
target_link_libraries( ambe libdliotp )

add_library( librscode IMPORTED SHARED )
set_target_properties( librscode PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/librscode.so )
target_link_libraries( ambe librscode )

add_library( libsecdll IMPORTED SHARED )
set_target_properties( libsecdll PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libsecdll.so )
target_link_libraries( ambe libsecdll )

add_library( libssl_solib IMPORTED SHARED )
set_target_properties( libssl_solib PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libssl_solib.so )
target_link_libraries( ambe libssl_solib )

add_library( libnative-lib IMPORTED SHARED )
set_target_properties( libnative-lib PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libnative-lib.so )
target_link_libraries( ambe libnative-lib )

add_library( libmutauth IMPORTED SHARED )
set_target_properties( libmutauth PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libmutauth.so )
target_link_libraries( ambe libmutauth )

add_library( libkmmform IMPORTED SHARED )
set_target_properties( libkmmform PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libkmmform.so )
target_link_libraries( ambe libkmmform )

add_library( libesotar IMPORTED SHARED )
set_target_properties( libesotar PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libesotar.so )
target_link_libraries( ambe libesotar )

add_library( libdtlsSocketlib IMPORTED SHARED )
set_target_properties( libdtlsSocketlib PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../lib/libdtlsSocketlib.so )
target_link_libraries( ambe libdtlsSocketlib )

add_library( zlib1g IMPORTED SHARED )
set_target_properties( zlib1g PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/linux_deps/libz.so )
target_link_libraries( ambe zlib1g )

add_library( libstdc++ IMPORTED SHARED )
set_target_properties( libstdc++ PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/linux_deps/libstdc++.so )
target_link_libraries( ambe libstdc++ )

add_library( liblog IMPORTED SHARED )
set_target_properties( liblog PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/linux_deps/liblog.so )
target_link_libraries( ambe liblog )

add_library( libc IMPORTED SHARED )
set_target_properties( libc PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/linux_deps/libc.so )
target_link_libraries( ambe libc )

