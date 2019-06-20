#ifndef MAIN_H
#define MAIN_H

#include <sstream>
#include <iostream>
#include <typeinfo>

#ifdef __cplusplus
   extern "C" {
#endif

typedef unsigned long long undefined8;
typedef unsigned int undefined4;

namespace BeOn {
  class AmbeVocoder {
    public:
      AmbeVocoder(short mode);
      ~AmbeVocoder();
      undefined4 encode(short const*, int, unsigned char*);
      undefined8 decode(unsigned char const*, int, short*);
      void disablePostDecodeCompression();
      void enablePostDecodeCompression(float, float, float, float);
      undefined8 unpackBytesToBits(short*, unsigned char const*, int, int);
      undefined8 packBitsToBytes(short*, unsigned char*, int, int);
      void decodeInit();
      void encodeInit();
  };
}

extern undefined8 dvsi_sqrt_coeff;

extern uint dvsi_fx_floor(int arg0, int arg1);
extern uint dvsi_fx_sqrt(uint arg0, int *piParm2);
extern int dvsi_fx_sqrt_scale(undefined4 uParm1,int iParm2,int iParm3);
extern int dvsi_fx_log2_scale(undefined4 uParm1,undefined4 uParm2,int iParm3);
extern int dvsi_fx_log2(int iParm1,int iParm2);
extern uint dvsi_fx_fourth_root(uint uParm1,int *piParm2);
extern int dvsi_fx_fourth_root_scale(undefined4 uParm1,int iParm2,int iParm3);
extern uint dvsi_add_float(uint param_1,uint param_2,uint param_3,uint param_4,uint *param_5);
extern uint dvsi_sub_float(int param_1,uint param_2,uint param_3,uint param_4,uint *param_5);
extern uint dvsi_pack(short *psParm1,int iParm2);
extern uint dvsi_pack_l(short *psParm1,int iParm2);
extern unsigned short * dvsi_unpack(int iParm1,int iParm2,int iParm3);
extern unsigned short * dvsi_unpack_l(int iParm1,int iParm2,int iParm3);
extern int dvsi_spectrum(int param_1,undefined4 param_2,int param_3,undefined4 param_4,int param_5,
                 undefined4 param_6,undefined4 param_7,undefined4 param_8,uint param_9,int param_10);
extern void dvsi_spectrum_scale(undefined4 param_1,undefined4 param_2,undefined4 param_3,undefined4 param_4
                        ,undefined4 param_5,undefined4 param_6,undefined4 param_7,undefined4 param_8
                        ,undefined4 param_9);
extern void dvsi_symmetric_window(int param_1,int param_2,int param_3,int param_4,int param_5,uint param_6);


#ifdef __cplusplus
}
#endif

#endif
