#include "main.h"

using namespace BeOn;

int main(void) {
    printf("Hello world !\n");

    int res = 0;
    int ret = dvsi_fx_sqrt(9, &res);

    printf("dvsi_fx_sqrt(9) result: %d return: %d\n", res, ret);

    printf("dvsi_fx_floor(99999, 1024) result: %d \n", dvsi_fx_floor(99999,1024));

    AmbeVocoder *vocoder(0);
    printf("typeid: %s \n", typeid(vocoder).name());
    printf("%p \n", &vocoder);
    delete vocoder;

    return 0;
}
